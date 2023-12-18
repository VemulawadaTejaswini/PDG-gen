
import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                int two=0;
                int four=0;
                int j=0;
                int n=scanner.nextInt();
                for(int i=0;i<n;i++){
                        j=scanner.nextInt();
                        if(j%2==0){
                                two++;
                                if(j%4==0){
                                        four++;
                                }
                        }
                }
                two-=four;
                if((n-two)>four*2+1){
                        System.out.println("No");
                }else{
                        System.out.println("Yes");
                }
        }
}