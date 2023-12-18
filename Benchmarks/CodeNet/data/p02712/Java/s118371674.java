public class Solution
{
	public static void main(String[] args) {
		String line = StdIn.readLine();
      	int N = String.parseInt(line);
      	int sum = 0;
      	for (int i = 0; i <= N; i++){
        	if (! i%3 == 0) & (! i%5 == 0){
            	sum += i;
            }
        }
      	System.out.println(sum);
	}
}