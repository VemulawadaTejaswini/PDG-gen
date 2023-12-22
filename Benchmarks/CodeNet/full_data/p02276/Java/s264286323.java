public class Main {

int partition(int[] array, int p, int r) {
	int pivot = array[r];
	int i = p - 1;
	int j = p;
	
	while (j < r) {
		if (i < j) {
			i++;
			swap(array, i, j);
		}
	}
	swap(array, i, r);

	return i++;
}

void swap(int[] array, int i, int j) {
	int tmp = array[j];
	array[j] = array[i];
	array[i] = tmp;
}

public static void main(String[] args) {
  int N = Integer.valueOf(args[0]);
  String input = args[1];
  String[] splitData = input.split(" ");
  int[] array = new int[N];
  for (int i = 0; i < N; i++) {
    array[i] = Integer.parseInt(splitData[i]);
  }
  
  int part = partition(array, 0, array.length - 1);
  
  for (int i = 0; i < N; i++) {
    System.out.print(array[i] + " "); 
    if (i == part) {
      System.out.print("[" + array[i] + "] ");
    }
  }
  System.out.println("");

}
}