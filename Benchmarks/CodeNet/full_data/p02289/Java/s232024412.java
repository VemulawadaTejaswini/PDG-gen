import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner in =  new Scanner (System.in);
		
		int numeros[] = new int[4];
		int cont = 0;
		
		while(in.hasNext()) {
			
			String toDo = in.next();
			
			if (toDo == "insert") {
				
				int inserir = in.nextInt();
				
				if(cont < numeros.length - 1) {
					numeros[cont] = inserir;
					cont++;
					heapSort(numeros, cont);
					
				}else if(cont == numeros.length) {
				
					numeros = biggerArray(numeros, inserir);
					cont++;
					heapSort(numeros, cont);
					
				}
			}else if (toDo == "extract") {
				System.out.println(numeros[0]);
				numeros = smallerArray(numeros);
				
			}else {
				
				break;
				
			}
		
			
		}
		

	}


	static int [] smallerArray (int[] numeros) {
		
		int array[] = new int [numeros.length-2];
		
		for (int i = 0; i < numeros.length -1; i++) {
			array[i] = numeros[i+1];
		}
		
		return array;
		
	}
	
	static int[] biggerArray(int[] numeros, int inserir) {
		int[] array = new int[numeros.length *2];
		for (int i = 0; i < array.length; i++) {
			if (i == array.length) {
				array[i] = inserir;
			}else {
				array[i] = numeros[i];
			}
		}

		return array;
	}

static void bottomUp(int a[], int num){
int k,v, j;

boolean checa;

for(int i = num/2; i >= 1; i--){
    k = i;

    checa = false;

    v = a[i];

    while(checa == false && (2*k) <= num){
        j = 2*k;
        if(j < num && a[j] < a[j+1]){

            j++;
        }
        if(v >= a[j]){

            checa = true;
        }
        else{

            a[k] = a[j];

            k = j;
        }
    }

    a[k] = v;
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
}

}
