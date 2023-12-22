class Main{
        public static void main(String[] args){
                java.util.Scanner sc = new java.util.Scanner(System.in);
                int n = sc.nextInt();
                while(n > 0){ 
                        int[][] matrix = new int[n+1][n+1];
                        for(int i = 0 ; i < n ; i++){
                                for(int j = 0 ; j < n ; j++){
                                        matrix[i][j] = sc.nextInt();
                                        matrix[i][n] += matrix[i][j];
                                        matrix[n][j] += matrix[i][j];
                                        matrix[n][n] += matrix[i][j];
                                }   
                        }   
                        for(int i = 0 ; i < n+1 ; i++){
                                for(int j = 0 ; j < n+1 ; j++){
                                        System.out.print(String.format("%5d",matrix[i][j]));
                                }   
                                System.out.println();
                        }   
                        n = sc.nextInt();
                }   
        }   
}