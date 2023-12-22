import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

	static long changecount = 0;
   public static void main(String args[]) throws IOException{

	   Scanner sc = new Scanner(System.in);
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt( br.readLine()  );


	   //String[] A = new String[n];
	   //String[] origin = new String[n];
       Card[] cards = new Card[n];

	   for(int i = 0;i < n; i++){
		   String string = br.readLine();
          cards[i] = new Card(string.split(" ")[0],Integer.parseInt(string.split(" ")[1]), i);
	   }



	   //int q = partition(A , 0 , n-1);
	   quicksort(cards , 0 , n-1);


	   boolean Choicecheck = true;

	   for(int i = 1, cardn = cards.length; i < cardn ; i++){
           if(cards[i-1].Number==cards[i].Number&& cards[i-1].Time >cards[i].Time)Choicecheck = false;
       }

	   if(Choicecheck){
		   System.out.println("Stable");
	   }else{
		   System.out.println("Not stable");
	   }




	   for(int i = 0;i < n; i++){

		   System.out.println(cards[i].Suite + " "+cards[i].Number);

	   }
	   //System.out.println("");
	   sc.close();
   }

   public static int partition(Card[] A, int p, int r){

	  int i = p-1;

       int x =  A[r].Number;


      for(int j = p; j < r; j++){

    	  int number =  A[j].Number ;
    	  if(number <= x){
    		  i++;
    		  Card tmp = A[i];
    		  A[i] = A[j];
    		  A[j] = tmp;
    	  }

      }


      Card tmp = A[i+1];
	  A[i+1] = A[r];
	  A[r] = tmp;

	  return i+1;
   }


   public static void quicksort(Card[] A, int p, int r){

    if(p < r){
    	//System.out.println( "quicksort" );
        int q = partition(A, p, r);
        quicksort(A, p, q-1);
        quicksort(A, q+1, r);
    }


  }




}

class Card{

	   String Suite;
    int Number;
    int Time;

     Card(String suite, int number, int time){
 	   this.Suite = suite;
 	   this.Number = number;
 	   this.Time = time;
    }
}