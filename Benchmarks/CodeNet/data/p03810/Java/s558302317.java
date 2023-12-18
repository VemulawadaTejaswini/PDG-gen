public class Mocha extends Condiments{

    Mocha(Bevarage bvr)
    {
        this.bvr=bvr;
        des=" , Mocha";
    }
    int cost() {
return bvr.cost()+10;
    }
    
}
