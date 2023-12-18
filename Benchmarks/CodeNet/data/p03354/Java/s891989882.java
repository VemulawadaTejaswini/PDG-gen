
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final int N=scanner.nextInt();
        final int M=scanner.nextInt();
        final int[] pArray=new int[N];
        for(int i=0;i<N;i++){
            pArray[i]=scanner.nextInt();
        }
        int[] oneUnion=new int[N];
        int count=1;
        for(int i=0;i<M;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            if(oneUnion[x-1]==0&&oneUnion[y-1]==0){
                oneUnion[x-1]=count;
                oneUnion[y-1]=count;
                count++;
            }else if(oneUnion[x-1]!=0&&oneUnion[y-1]!=0) {
                int newCat=Math.min(oneUnion[x-1],oneUnion[y-1]);
                int oldCat=Math.max(oneUnion[x-1],oneUnion[y-1]);
                for(int j=0;j<N;j++){
                    if(oneUnion[j]==oldCat) oneUnion[j]=newCat;
                }
            }else{
                    if(oneUnion[x-1]!=0){
                        oneUnion[y-1]=oneUnion[x-1];
                    }else{
                        oneUnion[x-1]=oneUnion[y-1];
                    }

            }
        }
        int result=0;
        for(int i=0;i<N;i++){
            if(oneUnion[i]!=0) continue;
            if(pArray[i]==i+1) result++;
        }
        int[] ints=new int[N];
        for(int i=0;i<N;i++){
            if(oneUnion[i]==0) continue;
            ints[pArray[i]-1]=oneUnion[i];
        }
        for(int i=0;i<N;i++){
            if(oneUnion[i]==0||ints[i]==0) continue;
            if(ints[i]==oneUnion[i]) result++;
        }
        System.out.println(result);
    }
}