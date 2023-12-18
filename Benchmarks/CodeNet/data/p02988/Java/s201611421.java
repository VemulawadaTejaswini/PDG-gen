import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int n = Integer.parseInt(str);

        int[] numbers = new int[n];
        
        for(int i=0; i<n; i++){
            String number = br.readLine();
            numbers[i] = Integer.parseInt(number);
        }

        int count = 0;
        for(int i=1; i<(n-1); i++){
            if(numbers[i] > numbers[i-1] && numbers[i] < numbers[i+1]){
                count++;
            }
            if(numbers[i] < numbers[i-1] && numbers[i] > numbers[i+1]){
                count++;
            }
        }

        System.out.println(count);
    }
}