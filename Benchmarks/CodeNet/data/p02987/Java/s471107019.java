import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer n = sc.next();
        Integer arr_then = sc.next();
        Integer[] arr = arr_then.split(" ",0);
        Integer count =0;

        for(int i=1; i<arr.lenght -2;i++)
        {
            count += check(i,arr[i],arr[i+1],arr[i+2]);
        }
        

    }
    public static int check(Integer a,Integer arr_i,Integer arr_i1,Integer arr_i2 )
    {
        Integer[] data = new int[3];
        data[0] = arr_i;
        data[1] = arr_i1;
        data[2] = arr_i2;
        Integer[] sorted = Arrays.sort(data);

        if(sorted[1]==arr_i1){
            return 1;
        }
        else
        {
            return 0;
        }
    }

}