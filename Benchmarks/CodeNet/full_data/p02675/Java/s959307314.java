class Main {

  public static void chan(int n){
    while(n>0){
      int hon1 = 2;
      int hon2 = 4;
      int hon3 = 5;
      int hon4 = 7;
      int hon5 = 9;

      int pon1 =0;
      int pon2 =1;
      int pon3 =6;
      int pon4 =8;

        if(n%10 == hon1||n%10 == hon2||n%10 == hon3||n%10 == hon4||n%10 == hon5){
            System.out.println("hon");
            break;
        }    
        if(n%10 == pon1||n%10 == pon2||n%10 == pon3||n%10 == pon4){
            System.out.println("pon");
            break;
        }
          if(n%10 == 3){
            System.out.println("bon");
            break;
        }

    }
  }


  public static void main(String[] args) {
    chan(16);
    chan(2);
    chan(183);
  }
}