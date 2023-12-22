

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class Main{
          
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         try{ String line;
             while((line=br.readLine())!=null){if(line.isEmpty())break;
                String spl[]=line.split(" ");
                int n=Integer.parseInt(spl[0]); if(n==0){break;}
                int mx=0; map mp = new map();
                for(int i=0;i<n;i++){
                    line=br.readLine();spl=line.split(",");
                    Double a = Double.parseDouble(spl[0]);
                    Double b = Double.parseDouble(spl[1]);
                    int kasanari =mp.add(new ten(a,b)); 
                    if(mx<kasanari){mx=kasanari;}
                    
                }
                 System.out.println(mx);
                break;
             }br.close();
         }catch(Exception e){e.printStackTrace();}         
     }  
    
     
}
class ten{ double x,y; ten(double a, double b){x=a;y=b;}
    boolean touch(ten tn){
        double dist = Math.sqrt((tn.x-x)*(tn.x-x)+(tn.y-y)*(tn.y-y));
        if(dist<=2) return true; else return false;
    }
}

class map{ArrayList<ten> tens = new ArrayList<ten>();
    public int add(ten tn){
        int cnt=0;
        for(ten tn1 : tens){if(tn1.touch(tn))cnt++;}
        tens.add(tn);return cnt+1;
    }
}