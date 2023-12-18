public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        int count = 0;
        long baseN = 0;
        long numAdded = 1;
        int countSum = 0;
        int numOfDigits = 1;
        
        for(int i = 0; i < k; i++){
            baseN += numAdded;
            countSum++;
            if(countSum == 9){
                countSum = 0;
                numAdded *= 10L;
                numOfDigits++;
            }
            if(numOfDigits == 16){
                break;
            }
            System.out.println(baseN);
        }
        
    }
}