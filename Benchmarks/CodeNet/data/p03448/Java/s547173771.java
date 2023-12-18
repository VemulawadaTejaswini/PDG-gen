public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
	 
    	int z = 0;
    
    	for(int i = 0; A==X; i++){
    		z = z+i;
    	}
    	for(int j = 0; B==X; j++){
    		z = z+j;
    	}
    	for(int k = 0; C==X; k++){
    		z = z+k;
        }
    	System.out.print(z);
    }
}
