import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n==0) break;

			int[] x = new int[n];
			int[] y = new int[n];

			for(int i=0; i<n; i++){
				String line[] = br.readLine().split(" ");
				x[i] = Integer.parseInt(line[0]);
				y[i] = Integer.parseInt(line[1]);
			}

			mergesort(x,y);

			int answer = 0;
			for(int i=0;i<n;i++){
				for(int j=i;j<n;j++){
					int xchange = x[j]-x[i];
					int ychange = y[j]-y[i];
					if(ychange<0) break;

					int firsthit = binerysearch(x,x[i]+ychange);
					if(firsthit<0) break;

					int fyhit = -1;
					while(x[firsthit]==x[i]+ychange){
						if(y[firsthit]==y[i]-xchange){
							fyhit = firsthit;
							break;
						}
						firsthit++;
					}
					if(fyhit<0) break;

					int secondhit = binerysearch(x,x[i]+xchange+ychange);
					if(secondhit<0) break;

					int syhit = -1;
					while(x[secondhit]==x[i]+xchange+ychange){
						if(y[secondhit]==y[i]-xchange+ychange){
							fyhit = secondhit;
							break;
						}
						secondhit++;
					}
					if(fyhit<0) break;

					answer = Math.max(answer, xchange*xchange + ychange*ychange);
				}
			}

			System.out.println(answer);
		}
	}


	static void merge(int[] array1, int[] array2, int[] omake1, int omake2[], int[] array, int[] omake){
		int i=0;
		int j=0;
		while(i<array1.length || j<array2.length){
			if(j== array2.length || (i<array1.length && array1[i] < array2[j])){
				array[i+j] = array1[i];
				omake[i+j] = omake1[i];
				i++;
			}else{
				array[i+j] = array2[j];
				omake[i+j] = omake2[j];
				j++;
			}
		}
	}

	static void mergesort(int[] array, int[] omake){
		if(array.length>1){
			int m = array.length/2;
			int n = array.length-m;

			int[] array1 = new int[m];
			int[] omake1 = new int[m];
			int[] array2 = new int[n];
			int[] omake2 = new int[n];

			for(int i=0;i<m;i++){
				array1[i] = array[i];
				omake1[i] = omake[i];
			}
			for(int i=0;i<n;i++){
				array2[i] = array[i+m];
				omake2[i] = omake[i+m];
			}
			mergesort(array1, omake1);
			mergesort(array2, omake2);
			merge(array1, array2, omake1, omake2, array, omake);
		}
	}

	static int binery(int[] array, int key){
		int left = 0;
		int right = array.length;
		while (left < right){
			int mid = (left+right) / 2;
			if (array[mid] == key) {
				return mid;
			}else if(key < array[mid]){
				right = mid;
			}else{
				left = mid+1;
			}
		}
		return -1;
	}

	static int binerysearch(int[] array, int key){
		int answer = binery(array,key);
		if (answer>=0){
			while(array[answer]==key){
				answer--;
				if (answer<0) break;
			}
			answer++;
		}
		return answer;
	}
}