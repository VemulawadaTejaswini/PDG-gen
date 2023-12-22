import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int game=N*(N-1)/2;
        int point[] =new int[N];
        for(int i=0;i<game;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(c<d){
                point[b-1]+=3;
            }else if(c>d){
                point[a-1]+=3;
            }else if(c==d){
                point[a-1]+=1;
                point[b-1]+=1;
        }
        }
        int r[]=new int[N];
        for(int i=0;i<N;i++){
        r[i]=1;
        for(int j=0;j<N;j++){
        if(point[i]<point[j]){
        r[i]=r[i]+1;
        }
        }
        }
        for(int i=0; i<N;i++){
        System.out.println(r[i]);
        }
    	}
		}