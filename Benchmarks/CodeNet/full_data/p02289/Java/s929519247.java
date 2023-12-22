import java.util.Scanner;
class Main{

	public static void main(String[] args) {

		Scanner in =  new Scanner (System.in);

		int numeros[] = new int[4];
		int cont = 0;
		boolean run = true;

		while(in.hasNext() && run == true) {

			String toDo = in.next();		

			if (toDo.equals("insert")) {

				int inserir = in.nextInt();


				if(cont < numeros.length) {
					numeros[cont] = inserir;
					cont++;

				}else { //if(cont > numeros.length) {

					numeros = biggerArray(numeros, inserir);
					cont++;

				}
			}else if (toDo.equals("extract")) {
				numeros = quicksort(numeros, 0, cont-1);
				System.out.println(numeros[cont-1]);
				numeros = smallerArray(numeros, cont);
				cont--;

			}else if(toDo.equals("end")) {

				run = false;

			}


		}


	}


	static int [] smallerArray (int[] numeros, int cont) {
		if (numeros.length > 1) {
			int [] smallerArray = new int [numeros.length-1];

			for (int i = 0; i < numeros.length - 1;i++) {
				if ( i == cont -1) {
					smallerArray[i] = 0;
				}else {
				smallerArray[i] = numeros[i];
				}

			}
			return smallerArray;
		}else {
			int smallerArray[] = new int [2];
			smallerArray[0] = 0;
			smallerArray[1] = 0;
			return smallerArray;
		}


	}

	static int[] biggerArray(int[] numeros, int inserir) {
		int[] array = new int[numeros.length *2];
		for (int i = 0; i < numeros.length + 1; i++) {
			if (i == numeros.length) {
				array[i] = inserir;
			}else {
				array[i] = numeros[i];
			}
		}

		return array;
	}

	static int partition(int prices[], int ini, int fim) {

	    int pivot, top, i;
	    pivot = prices[ini];
	    top = ini;

	    for (i = ini + 1; i <= fim; i++) {
	        if ( prices[i] < pivot ) {
	            prices[top] = prices[i];
	            prices[i] = prices[top + 1];
	            top++;
	        }
	    }

	    prices[top] = pivot;
	    return top;
	}


	static int[] quicksort(int prices[], int ini, int end) {
	    int middle;
	    if (ini < end) {
	        middle = partition(prices, ini, end);
	        quicksort(prices, ini, middle);
	        quicksort(prices, middle + 1, end);
	    }

	    return prices;

	}
	
	
	/*static int [] smallerArray (int[] numeros) {
		if (numeros.length >= 1) {
			int [] smallerArray = new int [numeros.length-1];

			//int cont = 0;
			for (int i = 0; i <= numeros.length - 2;i++) {
				smallerArray[i] = numeros[i+1];

			}
			return smallerArray;
		}else {
			int smallerArray[] = new int [0];
			return smallerArray;
		}


	}

	static int[] biggerArray(int[] numeros, int inserir) {
		int[] array = new int[numeros.length *2];
		for (int i = 0; i < numeros.length + 1; i++) {
			if (i == numeros.length) {
				array[i] = inserir;
			}else {
				array[i] = numeros[i];
			}
		}

		return array;
	}

	static void bottomUp(int a[], int num){
		int x, v, j;

		boolean checa;

		for(int i = num/2; i >= 1; i--){
			x = i;

			checa = false;

			v = a[i];

			while(checa == false && (2*x) <= num){
				j = 2*x;
				if(j < num && a[j] < a[j+1]){

					j++;
				}
				if(v >= a[j]){

					checa = true;
				}
				else{

					a[x] = a[j];

					x = j;
				}
			}

			a[x] = v;
		}
	}

	static int[] heapSort(int a[], int num){
		if(num > 1){
			bottomUp(a, num);

			int aux = a[num];

			a[num] = a[1];

			a[1] = aux;

			heapSort(a, num-1);
		}
		return a;
	}*/

}
