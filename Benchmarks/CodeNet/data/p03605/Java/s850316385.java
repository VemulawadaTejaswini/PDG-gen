    read h
    f=$(echo $h|awk '/9/')
    if [ "$f" ]
    then
      echo Yes
    else
      echo No
    fi