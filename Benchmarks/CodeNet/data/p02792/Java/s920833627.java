import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        
        int count = 0;
        for(int i=1;i<=n;i++){
            int len = String.valueOf(i).length();
            int lead = i / (int)Math.pow(10,len-1);
            int end = i%10;
            //System.out.println(i + " :  " + len + "  " + lead + "  " + end);
            if(end != 0){
                for(int j=0;j<String.valueOf(n).length();j++){
                    if(i>10 && lead!=end && j==0){

                    }else{
                        int v;
                        if(lead == end && j==0){
                            v = end * (int)Math.pow(10,j);
                        }else{
                            v = end * (int)Math.pow(10,j) + lead;
                        }
                        //System.out.println("j: " + j + "      count: " + count + "    v: " + v);
                        if(v > n) break;
                        if(j==0 || j==1)
                            count++;
                        else
                            count += (int)Math.pow(10,j-1);
                    //System.out.println("count: " + count);
                    }
                }
            }
        }

        System.out.println(count);
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
      }
}