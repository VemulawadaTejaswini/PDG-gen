public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        try{
        int n = scan.nextInt();
        System.out.println((int)Math.pow(n,3));            
        } catch (IOExcepton e){
            e.printStackTrace();
        } finally (Exception e) {
            e.printStackTrace();
        }

    }
}