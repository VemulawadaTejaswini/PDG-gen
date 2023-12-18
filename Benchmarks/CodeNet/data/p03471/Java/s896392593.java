mport java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int y10000 = 0;
        int y5000 = 0;
        int y1000 = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N-i;j++){
                if(10000*i+5000*j+1000*(N-i-j) == Y){
                    System.out.println(i+" "+j+" "+(N-i-j));
                    System.exit(0);
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}