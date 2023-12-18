public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        if (put.hasNextInt()){
            Integer a  = put.nextInt();
            Integer b = put.nextInt();
            Integer c  = put.nextInt();
            Integer sum = a + b + c;
            if(sum < 22){
                System.out.println("win");
            }else {
                System.out.println("bust");
            }
            
        }
        
    }