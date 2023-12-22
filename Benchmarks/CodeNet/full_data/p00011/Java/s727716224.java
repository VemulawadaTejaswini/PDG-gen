import  java.io.*;

public class Main{ 
        public static void main(String[] args){
            int i,a,temp,c;
            int b[];
            String line;
            b = new int[200];
            try{
                //Scanner n = new Scanner(System.in);
                BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
                String ac = k.readLine();
                a = Integer.parseInt(ac);
                for(i=1;i<=a;i++){
                    b[i] = i;
                }
                String cc = k.readLine();
                c = Integer.parseInt(cc);
                for(i=0;i<c;i++){
                    line = k.readLine();
                    String suuti[] = line.split(",");
                    int d = Integer.parseInt(suuti[0]);
                    int e = Integer.parseInt(suuti[1]);
                    temp = b[d];
                    b[d] = b[e];
                    b[e] = temp;
                }
                for(i=1;i<=a;i++){
                    System.out.println(b[i]);
                }
            }catch(IOException e) {
                System.out.println(e);
            } catch(NumberFormatException e){
                System.out.println(e);
            }
        }
    }
