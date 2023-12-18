public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long count=0;
        long instance=0;
        boolean bool = true;
        while (bool){
            if (n-instance-a<0){
                count += n - instance;
                bool = false;
            }else{
                instance+=a;
                count+=a;
            }
            if (n-instance-b<0){
                bool = false;
            }else{
                instance+=b;
            }
        }
        System.out.println(count);
    }

}