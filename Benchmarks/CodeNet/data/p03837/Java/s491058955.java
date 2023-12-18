import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num_vertex=scan.nextInt();
        int num_edge=scan.nextInt();
        int[] a=new int[num_edge];
        int[] b=new int[num_edge];
        int[] c=new int[num_edge];
        int i;
        for(i=0;i<num_edge;i++){
            a[i]=scan.nextInt();
            b[i]=scan.nextInt();
            c[i]=scan.nextInt();
        }
        int[] count=new int[num_edge];
        for(i=0;i<num_edge;i++){
            count[i]=0;
        }

        int j=0;
        int  use=0;
        for(i=0;i<num_edge;i++){
            int min_d=1000;
            for(j=i+1;j<num_edge;j++){
                for(int k=0;k<num_edge;k++){
                    if(a[k]==i && b[k]==j){
                        if(min_d>c[k]){
                            use=k;
                        }
                    }
                }
                count[use]++;
            }
        }

        int answer=0;
        for(i=0;i<num_edge;i++){
            if(count[i]==0){
                answer++;
            }
        }
        System.out.println(answer);
    }
}