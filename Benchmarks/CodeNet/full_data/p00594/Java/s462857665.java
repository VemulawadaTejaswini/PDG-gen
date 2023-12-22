import java.util.Scanner;
import java.util.Arrays;
public class Main {
        public static int ii[];
        public static void main(String[] args){
                Scanner in = new Scanner(System.in);
                while(true){
                        int n = in.nextInt();
                        if(n == 0){
                                break;
                        }
                        ii = new int[n];
                        for(int i = 0;i < n; ++i){
                                ii[i] = in.nextInt();
                        }
                        Arrays.sort(ii);
                        int x = ii[0];
                        int c = 1;
                        boolean yet = true;
                        for(int i = 1;i < n; ++i){
                                if(x == ii[i]){
                                        ++c;
                                } else {
                                        if(c > n/2){
                                                System.out.println(x);
                                                yet = false;
                                                break;
                                        }
                                        x = ii[i];
                                        c = 1;
                                }
                        }
                        if(yet && c > n/2){
                                System.out.println(x);
                        } else if(yet){
                                System.out.println("NO COLOR");
                        }
                }
        }
}