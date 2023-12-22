import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int animals=Integer.parseInt(st.nextToken());
        int legs=Integer.parseInt(st.nextToken());
        int c=0;
        int mask=0;
        int sum1=0;
        int sum2=0;
        if(animals==1 && (legs==2 || legs==4))
            System.out.println("Yes");
        else{
            if(legs%animals==0) {
                sum1=4*animals;
                sum2=2*animals;
            }
            else {
                if(legs%4==0){
                    sum1=legs;
                }
                else{
                    if(legs/4<animals){
                        int temp=animals-(legs/4);
                        if(temp*2+(legs/4)*4==legs){
                            sum1=legs;
                        }
                    }
                }
            }
            if(sum1==legs || sum2==legs)
                System.out.print("Yes");
            else
                System.out.print("No");
        }

    }
}
