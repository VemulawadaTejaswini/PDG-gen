import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num[] = new int[101];
        int alice = 0;
        int bob = 0;
        for(int i=0;i<N;i++){num[i]=sc.nextInt();}
        Arrays.sort(num);
        for(int i=0;i<N;i++){
            if(i%2==0){alice+=num[i];}
            else{bob+=num[i];}
        }
        System.out.println(Math.abs(alice-bob));
    }
}