import java.util.Scanner;


public class Main {
  enum Event {
  ARC,
  ABC
}
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		String h = in.nextLine();
      nextEvent(h);
    }
   static Event nextEvent(String event){
  if(event.equals(Event.ARC))
  {
    return Event.ABC ;
  }else{
    
        return Event.ARC ;

  }
}
    }
  