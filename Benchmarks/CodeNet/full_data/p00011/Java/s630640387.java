import java.util.Scanner;

class Main {
    public static void main(String[] z) {
        Scanner sc = new Scanner(System.in);
        int[] l=new int[sc.nextInt()];
        for(int i=0;i<l.length;i++) {
            l[i]=i;
        }
        int n=sc.nextInt();
        while(n-->0) {
            String[] lines=sc.next().split(",");
            int a=Integer.parseInt(lines[0])-1;
            int b=Integer.parseInt(lines[1])-1;
            int temp=l[a];
            l[a]=l[b];
            l[b]=temp;
        }
        for(int i:l) {
            System.out.println(i+1);
        }
    }
}

