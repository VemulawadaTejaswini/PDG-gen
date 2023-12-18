import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int g=sc.nextInt();
        int b=sc.nextInt();
        int N=sc.nextInt();
        int sum =0;
        for(int i=0; i<N/r+1; i++){
            for(int j=0; j<N/g+1; j++){
                int nokori=N-r*i-g*j;
                if(nokori<0){
                    break;
                }else{
                    // System.out.println("r:"+i+" g:"+j+", b:"+nokori%b);
                    if(nokori%b==0){
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
        // System.out.println("XXXXXXXX");
    }
}
