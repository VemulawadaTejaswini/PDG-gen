import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//Date allFrom = new Date();
		// TODO ?????????????????????????????????????????????

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//int n = Integer.parseInt(br.readLine());
		int n = 0;
		int tmp = br.read();
		while(tmp != 13 && tmp != 10){
			n = n * 10 + (tmp - '0');
			tmp = br.read();
		}


		/*
		String[] tmpArray = br.readLine().split(" ");
		int[] array = new int[n];
		int l;
		for(l = 0; l < n; l++){
			//array[i] = Integer.parseInt(tmpArray[i]);
			array[l] = nextInt(tmpArray[l]);
		}
		*/
		Date inputFrom = new Date();

		//int [] array = StringUtils.splitToInt(br.readLine(), " ");
		int[] array = new int[n];
		int num = 0;
		int i1 = 0;
		tmp = br.read();
		if(tmp == 13 || tmp == 10){
			tmp = br.read();
		}
		while(tmp != -1 && tmp != 10 && tmp != 13){
			num = 0;
			while(tmp >= '0' && tmp <= '9'){
				num = num * 10 + (tmp - '0');
				tmp = br.read();
			}
			if(tmp == -1){
				break;
			}
			array[i1] = num;
			i1++;
			tmp = br.read();
		}

		Date inputTo = new Date();
		//System.out.println("input takes " + (inputTo.getTime() - inputFrom.getTime()) + "milli sec");
		//?????§???????´¢
		int k = 0;

		for(int i = 0; i < n; i++){
			if(k < array[i]){
				k = array[i];
			}
		}
		//Date from = new Date();
		int[] output = CountingSort(array, k);
		//Date to = new Date();

		//System.out.println("sort takes " + (to.getTime() - from.getTime()) + "milli sec");

		//from = new Date();
		StringBuilder sb = new StringBuilder(output.length * 5 / 2);
		int outLen = output.length;
		sb.append(output[0]);
		for(int i = 1; i < outLen ; i++){
			//System.out.print(output[i]);
			sb.append(" "+output[i]);
			//if(i != outLen - 1){
				//System.out.print(" ");
				//sb.append(" ");
			//}
		}
		System.out.println(sb);
		//System.out.println();
		//to = new Date();

		//System.out.println("print takes " + (to.getTime() - from.getTime()) + "milli sec");

		//Date AllTo = new Date();
		//System.out.println("all takes " + (AllTo.getTime() - allFrom.getTime()) + "milli sec");

	}

	public static int nextInt(String input) {
        int len = input.length();
        int n = 0;
        boolean minus = false;
        int b = input.charAt(0);

        int i =0;
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(i < len){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else{
                throw new NumberFormatException();
            }
            i++;
            if(i != len){
            	b = input.charAt(i);
            }
        }

        return n;
    }
	static int[] CountingSort(int[] input, int k){
		int[] output = new int[input.length];
		int[] count = new int[k + 1];
		Arrays.fill(count, 0);

		for(int j = 0; j < input.length ;j++){
			count[input[j]]++;
		}

		for(int i = 1; i <= k ; i++){
			count[i] = count[i] + count[i - 1];
		}

		for(int j = input.length - 1; j >= 0 ; j--){
			output[count[input[j]] - 1] = input[j];
			count[input[j]]--;
		}

		return output;
	}
}

class StringUtils {
	public static int[] splitToInt(String str, String delimiter) {
        return splitToInt(str, delimiter, 10);
    }

	public static int[] splitToInt(String str, String delimiter, int radix) {
        String[] strs = split(str, delimiter);
        int[] result = new int[strs.length];
        int i;
        int length = result.length;
        for (i = 0; i < length; i++) {
            result[i] = Integer.parseInt(strs[i], radix);
        }
        return result;
    }
	public static String[] split(String str, String delimiter) {
        return split(str, delimiter, 0);
    }
	public static String[] split(String str, String delimiter, int limit) {
        List< String > result = new ArrayList< String >();
        int delimiterLen = delimiter.length();
        if (limit == 0) limit = str.length();

        if (limit > 0) {
            int start = 0;
            int end = 0;
            int i;
            for (i = 1; i < limit; i++) {
                end = str.indexOf(delimiter, start);
                if (end < 0) break;
                result.add(str.substring(start, end));
                start = end + delimiterLen;
            }
            result.add(str.substring(start));
        } else {
            int start = 0;
            int end = str.length();
            int i;
            for (i = -1; i > limit; i--) {
                start = str.lastIndexOf(delimiter, end - 1);
                if (start < 0) break;
                result.add(str.substring(start + delimiterLen, end));
                end = start;
            }
            result.add(str.substring(0, end));
        }
        return result.toArray(new String[0]);
    }
}