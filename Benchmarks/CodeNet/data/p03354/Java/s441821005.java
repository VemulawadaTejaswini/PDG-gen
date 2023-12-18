
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
        Set<Integer> cats=new HashSet<>();
        for(int i=0;i<M;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            if(oneUnion[x-1]==0&&oneUnion[y-1]==0){
                oneUnion[x-1]=count;
                oneUnion[y-1]=count;
                cats.add(count);
                count++;
            }else if(oneUnion[x-1]!=0&&oneUnion[y-1]!=0) {
                int newCat=Math.min(oneUnion[x-1],oneUnion[y-1]);
                int oldCat=Math.max(oneUnion[x-1],oneUnion[y-1]);
                for(int j=0;j<N;j++){
                    if(oneUnion[j]==oldCat) oneUnion[j]=newCat;
                }
                cats.remove(oldCat);
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
        for(int i=0;i<N;i++){
            if(oneUnion[i]==0) continue;
            int index=0;
            for(int j=0;j<N;j++){
                if(pArray[j]==i+1){
                    index=j;
                    break;
                }
            }
            if(oneUnion[i]==oneUnion[index]) result++;
        }
        System.out.println(result);
    }
}