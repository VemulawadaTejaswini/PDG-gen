import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Heap ripe = new Heap();
	String entradas = "";
	while(entradas!="end"){
	    entradas=in.next();
	    if (entradas.startsWith("i")){
	        int numero = in.nextInt();
	        ripe.insert(numero);
        }
	    else if (entradas.startsWith("ex")){
            System.out.println(ripe.Extract());
        }
    }


    }
}
 class Heap {
    int[] array;
    int size;

    public Heap(){
        this.array = new int[2000000];
        this.size=0;
    }

     public void insert(int numero ){
          array[size+1]=numero;
          size++;
          int aux=0;
          for(int i= size; i>1; i= i/2){
              if (array[i]>array[i/2]){
                  aux = array[i/2];
                  array[i/2]=array[i];
                  array[i]=aux;
              }
              else {
                  break;
              }
          }
     }

     public int Extract(){
        int aux2=0;
        aux2=array[1];
        array[1]= array[size];
        for (int i=1; i<size; ){
            if (array[i*2]>array[(i*2)+1]) {
                if (array[i] < array[i * 2]){
                    int aux3;
                    aux3 =array[i];
                    array[i]=array[i*2];
                    array[i*2]=aux3;
                    i=i*2;
                }
                else {
                    break;
                }
            }
            else {
                if(array[i]<array[(i*2)+1]){
                    int aux4;
                    aux4=array[i];
                    array[i]=array[(i*2)+1];
                    array[(i*2)+1]=aux4;
                    i=(i*2)+1;
                }
                else {
                    break;
                }
            }
            if (i>size){
                break;
            }
        }
        size--;
        return aux2;

     }

 }

