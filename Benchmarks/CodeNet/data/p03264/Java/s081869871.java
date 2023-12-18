public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        // input K
        int K = sc.nextInt();
        int odd = 0;
        int even = 0;
        
        if(K%2 == 1){
            odd = K/2 + 1;
            even = K/2;
        }
        else{
            odd = K/2;
            even = K/2;
        }
        System.out.println(odd * even);
    }
}
