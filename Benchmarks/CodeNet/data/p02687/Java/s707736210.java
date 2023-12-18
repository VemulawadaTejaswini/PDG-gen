enum Event {
  ARC,
  ABC
}

public event nextEvent(Event event){
  if(event.equals(event.ARC))
  {
    return Event.ABC ;
  }else{
    
        return Event.ARC ;

  }
}
  

