import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=sc.nextInt();
        int[]b=new int[m];
        int output=0;
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int tmp;
        for(int i=0;i<n;i++){
            tmp=0;
            for(int j=0;j<m;j++){
                tmp+=b[j]*sc.nextInt();
            }
            tmp+=c;
            if(tmp>0){
                output++;
            }
        }
        System.out.println(output);

    }

}