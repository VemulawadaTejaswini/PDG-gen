public class Main{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int i;
  while(true){
   int n = sc.nextInt();
   if(0 == n){break;}
   int[] scores = new int[n];
   for(i=0;i<scores.length;i++){
   scores[i] = sc.nextInt();
   } 
  double average=0 , variance=0;
  for(i=0;i<scores.length;i++){
   average = average + scores[i];
   }
   average = average/n;
   double[] var = new double[n];
   for(i=0;i<scores.length;i++){
   var[i] = (scores[i]-average)*(scores[i]-average);
   variance = variance + var[i];
   }
   variance = variance/n;
   System.out.println(Math.sqrt(variance));
  }
 }
}