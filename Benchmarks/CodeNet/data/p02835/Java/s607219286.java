public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        int a  = put.nextInt();
        int b =  put.nextInt();
        int c  = put.nextInt();
        int sum = 0;
        sum = a + b + c;
   
        if(sum < 22){
            System.out.println("win");
        }
        else {
            System.out.println("bust");
        }
    }