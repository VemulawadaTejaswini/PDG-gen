
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Main {
    public static void main(String args[]){
        String[] input=A0();
    }



    public static String[] A0(){

        int i=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String nm=reader.readLine();
            String[] sp=nm.split(" ");
            Long n=Long.parseLong( sp[0]);
            int m=Integer.parseInt( sp[1]);

            String[] ret=new String[m];
            for (int j = 0; j < m; j++) {
                ret[j]=reader.readLine();
            }
            reader.close();

            Set<Integer> ok=new HashSet<>();
            Map<Integer,Integer> error=new HashMap<>();
            for (int j = 1; j <= n; j++) {
                error.put(j,0);
            }

            for (int j = 0; j < m; j++) {
               String[] line= ret[j].split(" ");
               int num= Integer.parseInt( line[0]);
               String result=line[1];
               if(result.startsWith("AC")){
                   ok.add(num);
               }else if(!ok.contains(num)){
                   error.put(num,error.get(num)+1);
               }
            }
            long pena=0;
            for (int j = 1; j <=n ; j++) {
                if(!ok.contains(j)){
                    error.remove(j);
                }else {
                   pena+=error.get(j);
                }
            }

            System.out.print(ok.size());
            System.out.print(" ");
            System.out.println(pena);



        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}