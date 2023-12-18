import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        int A=stdIn.nextInt();
        int B=stdIn.nextInt();

        int t=A*25/2;
        double k=t*0.08;
        int i=0;
        if(k<A){
            t++;
        }
        if(A==0||A%2==1){
            while(i<12){
                if(t>=B*10){
                    break;
                }
                i++;
                    
                
            }
            if(i==12){
                System.out.println(-1);
            }
            else{
            System.out.println(t+i);
            }
        }
        else if(A%2==0){
                while(i<13){
                    if(t>=B*10){
                        break;
                    }
                i++;
            }
            if(i==13){
                System.out.println(-1);
                
            }
            else{
            System.out.println(t+i);
            }
        }    
        
        
    }
}