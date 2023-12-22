public class Main {
    public static void main(String[] args) {
        Scanner sc= newScanner(System.in); 
        int n = sc.nextInt(); 
        for (int i;i<n+1;i++){
            if(i%3==0){
                System.out.print(" "+ i);
            }
        }
        System.out.print("\n");
    }
}
