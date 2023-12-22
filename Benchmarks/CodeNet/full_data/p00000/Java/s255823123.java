class Main{
    public static void main(String[] a){
      int[] b = {1,2,3,4,5,6,7,8,9};
      int[] c = a;
      for(int multiplicand:b){
        for(int multiple:c){
          System.out.println(multiplicand + "*" + multiple + "="+ multiplicand*multiple);
        }
      }
    }
}