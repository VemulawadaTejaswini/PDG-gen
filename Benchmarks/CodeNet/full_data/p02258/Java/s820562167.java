import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(maxDiff(array));
    }
    private static int maxDiff(int[] array){
        int temp = array[0],
            max = temp,
            min = temp,
            maxDiff = array[1] - temp,
            work;
        // ?????????????????????????????§???max,min???????´¢
        for(int i=2; i<array.length; i++){
            work = array[i] - temp;
            if(work > maxDiff){
                maxDiff = work;
            }
            if(array[i] > max) max = array[i];
            else if(array[i] < min) min = array[i];
        }
        // ???????????\???
        for(int i=2;i < array.length-1; i++){
            temp = array[i];
            if(temp >= max - maxDiff)continue;
            for(int j=i+1; j<array.length; j++){
                if(array[j] - temp > maxDiff) maxDiff = array[j]-temp;
            }

            if(maxDiff == max - min)break;
        }
        return maxDiff;
  
      }

}