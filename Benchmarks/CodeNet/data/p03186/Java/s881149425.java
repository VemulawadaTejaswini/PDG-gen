<?php

$input = trim(fgets(STDIN));

$arr = explode(" ",$input);

$a = $arr[0];
$b = $arr[1];
$c = $arr[2];

$ab = $a + $b;
$bc = $b + $c;

if($ab <= $bc) {
  print $bc -1; 
} else {
  print $bc; 
}

?>