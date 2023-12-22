public class Main{

    public static void main(String a[])
        throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        long sum=0;
        while(scan.hasNext()){
            sum+=scan.nextInt();
    }
        System.out.println(sum/n);
    }
}