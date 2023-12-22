import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        Heap hp = new Heap();
        String entrada = in.nextLine();
        while(!entrada.equals("end")){
            String[] entradaTratada = entrada.split(" ");
            if(entradaTratada[0].equals("insert")){
                hp.inserir(Integer.parseInt(entradaTratada[1]));
            }else{
                System.out.println(hp.remover());
            }
            entrada = in.nextLine();
        }
    }
}
class Heap{
    int[] heap = new int[2000000];
    int lastPos = 0;
    public Heap(){

    }
    public void inserir(int valor){
        heap[lastPos] = valor;
        heapfy(lastPos);
        lastPos++;
    }
    public void heapfy(int pos){
        if(heap[getPai(pos)]< heap[pos]){
            int temp = heap[getPai(pos)];
            heap[getPai(pos)] = heap[pos];
            heap[pos] = temp;
            heapfy(getPai(pos));
        }
    }
    public int getPai(int pos){
        return (pos-1)/2;
    }
    public int getFilhoEsquerdo(int pos){
        return (pos*2)+1;
    }
    public int getFilhoDireito(int pos){
        return (pos*2)+2;
    }
    public void imprimir(){
        for(int i = 0;i<lastPos;i++){
            System.out.print(heap[i]+" ");
        }
    }
    public int remover(){
        int retorno = heap[0];
        lastPos--;
        heap[0] = heap[lastPos];
        siftDown(0);
        return retorno;

    }
    public void siftDown(int pos){
        boolean filhoEsquerdoExiste = getFilhoEsquerdo(pos)<lastPos ? true:false;
        boolean filhoDireitoExiste = getFilhoDireito(pos)<lastPos ? true:false;
        if(filhoEsquerdoExiste && filhoDireitoExiste){
            if(heap[getFilhoEsquerdo(pos)] >= heap[getFilhoDireito(pos)]){
                if(heap[getFilhoEsquerdo(pos)] > heap[pos]){
                    int temp = heap[getFilhoEsquerdo(pos)];
                    heap[getFilhoEsquerdo(pos)] = heap[pos];
                    heap[pos] = temp;
                    siftDown(getFilhoEsquerdo(pos));
                 }
            }else if(heap[getFilhoDireito(pos)]> heap[pos]){
                int temp = heap[getFilhoDireito(pos)];
                heap[getFilhoDireito(pos)] = heap[pos];
                heap[pos] = temp;
                siftDown(getFilhoDireito(pos));
            }
        }else if(filhoEsquerdoExiste){
            if(heap[getFilhoEsquerdo(pos)] > heap[pos]){
                int temp = heap[getFilhoEsquerdo(pos)];
                heap[getFilhoEsquerdo(pos)] = heap[pos];
                heap[pos] = temp;
                siftDown(getFilhoEsquerdo(pos));
             }
        }
    }
}

