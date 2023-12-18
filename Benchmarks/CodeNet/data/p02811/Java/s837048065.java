    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int X = sc.nextInt();
        // スペース区切りの整数の入力
        int K = sc.nextInt();

      
      if((500*X) >= K){
        System.out.println("Yes")
      }else{
          System.out.println("No")
      }
      
    }