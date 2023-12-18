
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N=scanner.nextInt();
        final int NN=100001;
        int[] count=new int[NN];
        int[] sample={0,1,2,3,4,5,1,2,3,1};
        for(int i=0;i<sample.length;i++){
            count[i]=sample[i];
        }
        for(int i=sample.length;i<NN;i++){
            int minNum=Integer.MAX_VALUE;
            int j=0;
            while(i>Math.pow(6,j)){
                if(minNum>count[i-(int)Math.pow(6,j)]){
                    minNum=count[i-(int)Math.pow(6,j)]+1;
                }
                j++;
            }
            j=0;
            while(i>Math.pow(9,j)){
                if(minNum>count[i-(int)Math.pow(9,j)]){
                    minNum=count[i-(int)Math.pow(9,j)]+1;
                }
                j++;
            }
            count[i]=minNum;
        }
        System.out.println(count[N]);

    }
}
