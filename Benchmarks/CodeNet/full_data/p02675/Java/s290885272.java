
   Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int ld = N % 10;
    switch (ld) {
      case 2:
      case 4:
      case 5:
      case 7:
      case 9:
        System.out.println("hon");
        break;
      case 0:
      case 6:
      case 1:
      case 8:
        System.out.println("pon");
        break;
      case 3:
        System.out.println("bon");
        break;
    }
  

