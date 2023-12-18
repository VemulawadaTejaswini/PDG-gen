    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int humanNum = nextInt();
        int train = nextInt();
        int tax = nextInt();
        
        int trainSum = humanNum * train;
        
        int rst = 0;
        if(trainSum>=tax){
            rst = tax;
        }else{
            rst = trainSum
        }
        
        System.out.println(rst);
    }