import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int r;
        int tmp[] = new int[50];
        while((n = sc.nextInt()) != 0 && (r = sc.nextInt()) != 0 ){
            int fuda[] = new int[n];
            for(int i=0;i<n;i++){
                fuda[i] = n - i;
            }
            for(int i=0;i<r;i++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                for(int j=0;j<p-1;j++){
                    tmp[j] = fuda[j];
                }
                for(int j=p-1;j<=p+c-2;j++){
                    fuda[j-p+1] = fuda[j];
                }
                for(int j=c;j<=p+c-2;j++){
                    fuda[j] = tmp[j-c];
                }
            }
            System.out.println(fuda[0]);
        }  
        sc.close();
    }
}
