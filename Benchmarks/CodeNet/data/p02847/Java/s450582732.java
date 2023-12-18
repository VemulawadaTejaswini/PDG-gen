
    public static void main(String[] args) {
         Scanner r = new Scanner(System.in);
         String day = r.next();
         if (day == "Sunday") {
             System.out.println("7");
            // System.out.println("It is Sunday today, and seven days later, it will be Sunday again.");
         }
         else if (day == "Monday"){
             System.out.println("6");


         }
         else if (day=="Tuesday"){
             System.out.println("5");
         }
         else if (day == "Wednesday"){
             System.out.println("4");
         }
         else if (day == "Thursday"){
             System.out.println("3");}
         else if (day == "Friday"){
             System.out.println("2");}
         else if (day == "Saturday"){
             System.out.println("1");
         }
       }