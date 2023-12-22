import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        HashSet hs = new HashSet();
        String Ans = scan.next();
        for(int i=0;i<Ans.length();i++){
            for(int j=1;j<Ans.length()+1;j++){
                String kari="1";
                try{
                kari= Ans.substring(i,j);
                //System.out.println(kari);
                double Kans = Double.parseDouble(kari);
                if(Kans%2019==0){
                    String x =i+","+j;
                    hs.add(x);
                }
                
                }
                catch(NumberFormatException e){
                    continue;
                }
                catch(StringIndexOutOfBoundsException ee){
                    continue;
                }
            }
        }
        System.out.println(hs.size());
    }
}
