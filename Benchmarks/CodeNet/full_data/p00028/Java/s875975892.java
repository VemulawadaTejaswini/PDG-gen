import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list=new int[100];
        int max=0;
        while(sc.hasNext()) {
            int n=sc.nextInt()-1;
            list[n]++;
            max=Math.max(max, list[n]);
        }
        for(int i=0;i<100;i++) {
            if(max==list[i]) {
                System.out.println(i+1);
            }
        }
    }
}
