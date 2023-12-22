class Main {
   public static void main(String[] args){
   BufferReader br = new BufferReader();
   int x = Integer.parseInt(br.readLine());
   x = x * x * x;
   System.out.println(x);
}
}