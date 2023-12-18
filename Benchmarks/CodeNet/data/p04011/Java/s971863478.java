    public static void main(String[] args) {
        
        System.out.println(
            new App().calcCost(
                 toInt(args[0])
                ,toInt(args[1])
                ,toInt(args[2])
                ,toInt(args[3])
            )
        );
    }

    public static int toInt (String a) {
        return Integer.parseInt(a);
    }

    private int calcCost(
          final int numStayDay
        , final int limitDay1
        , final int amountDay1
        , final int amountDay2) {

        final int numOfHighCostDay = limitDay1 > numStayDay ? 0 : numStayDay - limitDay1;
        final int x = limitDay1 * amountDay1;
        final int y = numOfHighCostDay * amountDay2;
        return x + y;
    }