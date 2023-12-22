import java.util.Scanner;
public class Main{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                while (true){
                        int H=sc.nextInt();
                        int W=sc.nextInt();
                        if (H==0&&W==0){
                                break;
                        }
                        for(int i=1;i<=H/2;i++){
                                for(int j=1;j<=W/2;j++){
                                        System.out.printf("#.");
                                        if(W%2==0&&j==W/2) System.out.printf("\n");
                                        if(W%2!=0&&j==(W-1)/2) System.out.printf("#\n");
                                }
                                for(int k=1;k<=W/2;k++){
                                        System.out.printf(".#");
                                        if(W%2==0&&k==W/2) System.out.printf("\n");
                                        if(W%2!=0&&k==(W-1)/2) System.out.printf(".\n");
                                }
                        }
                        if(H%2!=0){
                                for(int l=1;l<=W/2;l++){
                                        System.out.printf("#.");
                                        if(W%2==0&&l==W/2) System.out.printf("\n");
                                        if(W%2!=0&&l==(W-1)/2) System.out.printf("#\n");
                                }

                        }
                        System.out.printf("\n");
                }
        }
}